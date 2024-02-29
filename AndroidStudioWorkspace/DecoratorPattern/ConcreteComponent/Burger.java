// 包路径
package DecoratorPattern.ConcreteComponent;

// 引用 Meal接口 
import DecoratorPattern.AbstractComponent.Meal;

// "ConcreteComponent" 具体组件，即主食，我们这里的例子是汉堡
// 实现了 Meal接口的Burger类，展示了基础组件（即未被装饰的部分）的行为
public class Burger implements Meal{

    // 描述方法的具体实现，简单地返回"汉堡"，代表这个Meal是一个汉堡
    @Override
    public String getDescription() {
        return "汉堡";
    }

    // 为获取汉堡的价格提供了具体实现，这里简单地返回20.0，代表这个汉堡的价格是20.0元
    @Override
    public double getCost() {
        return 20.0;
    }    
}