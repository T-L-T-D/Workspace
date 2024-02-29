// 包路径
package DecoratorPattern.ConcreteDecorator;

// 引用 Meal接口 和 IngredientDecorator类
import DecoratorPattern.AbstractComponent.Meal;
import DecoratorPattern.AbstractDecorator.IngredientDecorator;

// "ConcreteDecorator" 具体装饰者 —— "奶酪"
// Cheese是另一个具体的装饰者，通过继承 IngredientDecorator 抽象装饰者实现 Meal接口
public class Cheese extends IngredientDecorator{

    // 构造函数接收一个 Meal对象（可能是一个基础组件如汉堡，或者已经被其他装饰者装饰过的 Meal）
    public Cheese(Meal decoratedMeal) {
        // 调用父类的构造函数来持有 Meal对象的引用
        super(decoratedMeal);
    }

    // 重写getCost方法，返回的是被装饰者的成本加上奶酪的成本，‘+2.0’表示奶酪的成本
    @Override
    public double getCost() {
        return super.getCost()+2.0;
    }

    // 重写getDescription方法，返回的是被装饰者的描述，并追加上奶酪的描述，‘，奶酪’表示奶酪的描述
    @Override
    public String getDescription() {
        // super.getDescription() 是获取decoratedMeal的描述，+"，奶酪"是添加奶酪的描述
        return super.getDescription()+"，奶酪";
    }
}