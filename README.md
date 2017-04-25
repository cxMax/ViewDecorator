# ViewDecorator
This is a model for the design of the decorator , it's use for expanding extra function in a view or viewholder

## introduce
decorate a normal item(eg : ItemView , ViewHolder) to expand an extra functional component.(eg : closebeta functional component, subscribe functional component).

## usage
1. define interface in {@link IViewExpand} and be invoked in target(eg : {@link com.meizu.cloud.app.widget.RankAppItemView})
2. generate a specific expandable functional logic class which extends {@link AbsViewDecorator}
3. use directly as below
```
      ViewDecorator.instance()
               .param(subscribeParam)
               .decorator(RankAppSubscribeItemViewDecorator.Class)
               .decorate(rankAppItemView)
```

## License
   Copyright (C) 2017 cxMax
   Copyright (C) 2017 ViewDecorator

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
