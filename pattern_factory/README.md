
### 3 kinds of factory pattern

1. 简单工厂
    产品抽象成接口，在工厂类中根据指定名称生产产品。可以生产各种类型的产品，无规范标准。
2. 工厂方法
    工厂定义为接口。每个类别的产品实现工厂接口，在自己工厂内部完成产品生产。用户要获取到产品的话，需要先指定相应的工厂。
3. 抽象工厂
    工厂定义为抽象类，这个抽象工厂可以生产各种类别的产品（抽象方法），同时设计成抽象类的话可以在其中实现公共的业务逻辑。
    抽象工厂的具体实现类中，调用各个产品各自的工厂进行产品生产。
    抽象工厂是用户的主入口，拥有抽象工厂的对象后用户可以选择性地调用某个生产产品方法。并且如果有新的产品类别，用户调用端无需改动。




