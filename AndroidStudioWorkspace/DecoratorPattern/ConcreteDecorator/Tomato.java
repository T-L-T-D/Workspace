// 包路径
package DecoratorPattern.ConcreteDecorator;

// 引用 Meal接口 和 IngredientDecorator类
import DecoratorPattern.AbstractComponent.Meal;
import DecoratorPattern.AbstractDecorator.IngredientDecorator;

// 定义 "ConcreteDecorator" 具体装饰者 —— "番茄"
// Tomato 是另一个具体的配料，它也通过继承 IngredientDecorator 装饰者抽象类来实现 Meal接口
public class Tomato extends IngredientDecorator{

    // 构造函数接收一个 Meal对象（可以是具体的主食，也可以是已装饰过的 Meal）
    public Tomato(Meal decoratedMeal) {
        // 委托给父类保存 Meal对象
        super(decoratedMeal);
    }

    // 装饰者会改变原有对象的行为，这一改变体现在 getCost 方法上
    // 不仅返回 decoratedMeal （已装饰的 Meal）的价格，同时加上番茄的价格，这里‘+0.5’就是番茄的价格
    @Override
    public double getCost() {
        return super.getCost()+0.5;
    }

    // 不仅返回 decoratedMeal （已装饰的 Meal）的详情，而且加上番茄的描述，这里 ‘，番茄’ 就是番茄的描述
    @Override
    public String getDescription() {
        return super.getDescription()+"，番茄";
    }
    
}