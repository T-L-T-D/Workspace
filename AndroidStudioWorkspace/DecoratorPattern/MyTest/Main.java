// 包路径
package DecoratorPattern.MyTest;

// 导入需要的类和接口
import DecoratorPattern.AbstractComponent.Meal;
import DecoratorPattern.ConcreteComponent.Burger;
import DecoratorPattern.ConcreteDecorator.Cheese;
import DecoratorPattern.ConcreteDecorator.Lettuce;
import DecoratorPattern.ConcreteDecorator.Tomato;

// 主要的测试类
public class Main {
    // 主方法
    public static void main(String[] args) {
        // 创建一个基础的 Meal 对象，这里是一个汉堡
        Meal meal = new Burger();
        // 打印这个汉堡的描述和价格
        System.out.println(meal.getDescription() + " 价格：" + meal.getCost());

        // 将刚才创建的汉堡用生菜装饰, 现在 meal 引用的是一个加了生菜的汉堡
        meal = new Lettuce(meal); 
        // 打印这个加了生菜的汉堡的描述和价格
        System.out.println(meal.getDescription() + " 价格：" + meal.getCost());

        // 现在我们又用番茄来装饰，现在meal引用的是一个加了生菜和番茄的汉堡
        meal = new Tomato(meal); 
        // 打印这个加了生菜和番茄的汉堡的描述和价格
        System.out.println(meal.getDescription() + " 价格：" + meal.getCost());

        // 最后我们用奶酪来装饰，现在 meal 引用的是一个加了生菜,番茄和奶酪的汉堡
        meal = new Cheese(meal);
        // 打印这个加了生菜,番茄和奶酪的汉堡的描述和价格
        System.out.println(meal.getDescription() + " 价格：" + meal.getCost());
    }
}