package com.cxmax.library;

/**
 * @describe : decorate a normal item(eg : ItemView , ViewHolder) to expand an extra function component
 *              (eg : closebeta functional component, subscribe functional component).
 *
 *
 * @usage :
 *      1. define interface in {@link IViewExpand} and be invoked in target
 *      2. generate a specific expandable functional logic class which extends {@link AbsViewDecorator}
 *      3. use directly as below
 *      ViewDecorator.instance()
 *               .param(subscribeParam)
 *               .decorator(RankAppSubscribeItemViewDecorator.Class)
 *               .decorate(rankAppItemView)
 * <p>
 * </p>
 * Created by caixi on 17-4-20.
 */

public class ViewDecorator {

    public static final String TAG = ViewDecorator.class.getSimpleName();

    public static ViewDecoratorManager instance() {
        return new ViewDecoratorManager();
    }

    public static class ViewDecoratorManager{
        BaseParam param;
        AbsViewDecorator decorator;

        public ViewDecoratorManager param(BaseParam baseParam) {
            this.param = baseParam;
            return this;
        }

        public ViewDecoratorManager decorator(Class<? extends AbsViewDecorator> clz) {
            try {
                decorator = (AbsViewDecorator) Class.forName(clz.getName()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return this;
        }

        public <T> T decorate(T t) {
            assertNecessaryParamsNotNull();
            return (T) decorator.init(param , t);
        }

        private void assertNecessaryParamsNotNull() {
            if (param == null) {
                throw new NullPointerException("GameCenter." + TAG + "is lack of params , don't forget to invoke param() before decorate!");
            } else if (decorator == null) {
                throw new NullPointerException("GameCenter." + TAG + "is lack of decorator , don't forget to invoke decorator() before decorate!");
            }
        }


    }
}
