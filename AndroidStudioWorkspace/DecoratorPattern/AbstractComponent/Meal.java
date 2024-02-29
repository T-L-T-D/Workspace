// 包路径
package DecoratorPattern.AbstractComponent;

// "Component"抽象组件，定义了我们的主食和配料共有的行为
public interface Meal {
    
    //该方法用于返回食物的描述，例如 "汉堡"， "汉堡，配生菜" 等
    String getDescription();
    
    //该方法用于返回食物的价格，每个具体的食物（如汉堡或配料）都有自己的价格
    //如果是被装饰的食物（即已加上配料的主食），则返回的价格应包含所有的配料价格和主食价格
    double getCost();  
}