// 包路径
package DecoratorPattern.ConcreteDecorator;

// 引用 Meal接口 和 IngredientDecorator类
import DecoratorPattern.AbstractComponent.Meal;
import DecoratorPattern.AbstractDecorator.IngredientDecorator;

// 定义 "ConcreteDecorator" 具体装饰者 —— "生菜"
// Lettuce 是一个具体的配料，通过继承 IngredientDecorator 装饰者抽象类来实现 Meal接口
public class Lettuce extends IngredientDecorator{

    // 构造函数接收一个 Meal对象（可以是具体的主食，也可以是已装饰过的 Meal）
    public Lettuce(Meal decoratedMeal) {
        // 委托给父类保存 Meal对象 
        super(decoratedMeal);
    }

    // 装饰者会改变原有对象的行为，这一改变体现在 getCost 方法上
    // 不仅返回 decoratedMeal （已装饰的 Meal）的价格，还加上生菜的价格，‘+1.0’就是生菜的价格
    @Override
    public double getCost() {
        return super.getCost()+1.0;
    }

    // 不仅返回 decoratedMeal （已装饰的 Meal）的详情，还加上生菜的描述，‘，生菜’就是生菜的描述
    @Override
    public String getDescription() {
        return super.getDescription()+"，生菜";
    }
}