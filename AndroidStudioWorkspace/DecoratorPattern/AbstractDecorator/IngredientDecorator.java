// 包路径
package DecoratorPattern.AbstractDecorator;

// 引入 Meal接口 
import DecoratorPattern.AbstractComponent.Meal;

// "Decorator" 抽象装饰者，所有的配料都会继承这个类，以增加新的行为（即描述新的配料和计算新配料的价钱）
public abstract class IngredientDecorator implements Meal {
    // 创建了一个受保护的Meal类型的变量，它会在IngredientDecorator类及其子类中保存被装饰的Meal对象
    protected Meal decoratedMeal;

    // 在构造器中初始化Meal类型的变量，使得每个 IngredientDecorator 对象都可以记住它所修饰的Meal对象
    public IngredientDecorator(Meal decoratedMeal) {
        this.decoratedMeal = decoratedMeal;
    }

    // 提供了默认的行为：返回被修饰的Meal对象的description
    // 具体装饰者可以通过覆盖这个方法来添加新的描述信息
    @Override
    public String getDescription() {
        return decoratedMeal.getDescription();
    }

    // 提供了默认的行为：返回被修饰的Meal对象的cost
    // 具体装饰者可以通过覆盖这个方法实现对价格的增加
    @Override
    public double getCost() {
        return decoratedMeal.getCost();
    }  
}