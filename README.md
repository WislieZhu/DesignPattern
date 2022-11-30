一、创建型模式（5种）
1、单例模式（Singleton）
2、工厂模式（Factory）
3、抽象工厂模式（Abstract Factory）
4、生成器模式（Builder）
5、原型模式（prototype）
二、结构型模式(7种)
1、代理模式（Proxy）
2、适配器模式（Adapter）
3、桥接模式（bridge）
4、组合模式(composite)
5、外观模式/门面模式（Facade）
6、装饰模式(Decorator/Wapper)
7、享元模式(Flyweight)
三、行为型模式（12种）
1、责任链模式（Chain of Responsibility）
2、命令模式（Command）
3、迭代器模式（Iterator）
4、中介模式（Mediator）
5、备忘录模式（Memento）
6、观察者模式/发布订阅模式（Observer/Listener）
7、状态模式（State）
8、策略模式（Strategy）
9、模版模式（template）
10、访问者模式（Visitor）
11、空对象模式（Empty）
12、解释器模式（Interpreter

观察者设计模式
内容:
1.理解
2.理解Jetpack的Lifecycle 注册  :将观察者存放到map中
3.理解View.OnClickListener  :接口引用赋值调用方法
4.理解RxJava的分发

定义:
存在目标对象和观察者对象，1对多的关系，目标对象的状态发生改变，有依赖关系的观察者对象会执行相应的任务
观察者模式又叫发布-订阅模式
订阅: 这些观察者需要想目标对象进行注册，这样目标对象才知道哪些对象在观察他
发布:目标对象的状态发生改变，他就向所有的观察者对象发布状态更改的消息

![image-20221129162922465](C:\Users\wislie\AppData\Roaming\Typora\typora-user-images\image-20221129162922465.png)

有两种方式可以让观察者对象获取到目标对象的新状态

1.目标对象调用每个观察者的update方法时，将新状态的数据作为该update方法的一个参数传递给观察者对象
2.观察者拥有他的目标对象的引用，再通过该引用调用目标对象的某个方法，该方法返回目标对象的新状态

责任链模式
内容:
1.理解
2.理解OkHttp的责任链  
3.理解Activity->ViewGroup->View
4.理解PermissionX

定义:请求在一个或多个节点上处理，处理完一个节点上的逻辑，再将请求传递到下一个节点， 这些节点就形成了一条链

        if(..) request     if(..) request     if(..) request
chain1-------------------->chain2-------------------->chain3-------------------->chain4
else 处理         			  else 处理         			  else 处理           			 处理

2.OkHttp的责任链 

           请求                    请求                     请求
拦截器1 ------------->  拦截器2-------------->拦截器3-------------->拦截器4
处理Response <------- 处理Response <------- 处理Response <-------  创建的Response  

U型结构
并且是借助chain得到下一个拦截器

3.Activity->ViewGroup->View
                        
Activity                PhoneWindow                  DecorView             ViewGroup
dispatchTouchEvent->     superDispatchTouchEvent->    dispatchTouchEvent->  dispatchTouchEvent->
                  <-                          <-                       <-                   <-   
ViewGroup                
onInterceptTouchEvent->
                     <-

ViewGroup                        View                 View
dispatchTransformedTouchEvent->  dispatchTouchEvent-> onTouchEvent
                             <-                    <-

-> 先执行
<- 等"->"执行完再执行

如果dispatchTouchEvent返回true,后面的->就执行不到了


代理设计模式
内容:
1.理解
2.ActivityManagerProxy
3.理解Retrofit
4.Context的设计
5.Binder的设计


