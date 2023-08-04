# Java 基础

## Java 基础语法

https://www.runoob.com/java/java-basic-syntax.html

### 一、基本语法

1.**大小写敏感**

2.**类名命名规范**

3.**方法名命名规范**

4.**主方法入口**

### 二、Java 标识符

标识符：类名、变量名以及方法名

### 三、Java修饰符

- 访问控制修饰符 : default, public , protected, private

  **private**：表示私有的,表示类访问权限.<font color="#dd0000">只能在本类中访问</font>,离开本类之后,就不能直接访问.<font color="#dd0000">加了private的方法或变量不能通过类名.的方法访问</font>

  **default**：不写(缺省)(void):表示包私有,表示<font color="#dd0000">包访问权限</font>. 访问者的包必须和当前定义类的包相同才能访问.(两个类在同一个包下)

  **protected**：被protected修饰的成员对于<font color="#dd0000">本包和其子类</font>(extends)可见

  **public**：表示全局的,可以<font color="#dd0000">公共访问</font>权限,如某个字段/方法,使用了public修饰,则可以在当前项目中任何地方访问
  ![java修饰符](https://img-blog.csdnimg.cn/a31752f295da446185bff0a0460e7451.png)

- 非访问控制修饰符 : final, abstract, static, synchronized

  **static** 修饰符，用来修饰类方法和类变量
  **final** 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的

  **abstract** 修饰符，用来创建抽象类和抽象方法。抽象类不能用来实例化对象，声明抽象类的**唯一目的**是为了<font color="#dd0000">将来对该类进行扩充</font>。

  一个类不能同时被 abstract 和 final 修饰。如果一个类包含抽象方法，那么该类一定要声明为抽象类，否则将出现编译错误。

  抽象类可以包含抽象方法和非抽象方法。

  **synchronized** 和 **volatile** 修饰符，主要用于线程的编程。synchronized 关键字声明的方法同一时间只能被一个线程访问。(*注：transient 修饰符修饰的变量不进行序列化*)

### 四、Java 变量

- **局部变量**：**对象生成(new)时才会有**。在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，<font color="#dd0000">方法结束后，变量就会自动销毁</font>。

- **类变量**（静态变量）:**类加载时就会有**。类变量也声明在类中，方法体之外，但必须声明为 <font color="#dd0000">static 类型</font>。

- **成员变量**（非静态变量）：成员变量是<font color="#dd0000">定义在类中，方法体之外的变量</font>。**这种变量在创建对象的时候实例化**。成员变量可以被类中方法、构造方法和特定类的语句块访问

  ```java
  public class Hero {
  
  	int age;//成员变量
  	String name;//成员变量
  
  	static int age1;//类变量（静态变量）不加public默认表示包权限
  	static String name2;//类变量（静态变量）不加public默认表示包权限
  
  	public void run(){
  		String name3;//局部变量
  		int age3;//局部变量
  
  	}
  
  }
  ```

  

### 五、Java 数组

### 六、Java 枚举

**Java 5.0**引入了枚举，枚举限制变量只能是预先设定好的值。使用枚举可以减少代码中的 bug。

### 七、Java 关键字

Java 关键字。这些保留字不能用于常量、变量、和任何标识符的名称(详情见链接https://www.runoob.com/java/java-basic-syntax.html)

### 八、Java注释

支持**单行注释**和**多行注释**

```java
public class HelloWorld {
   /* 这是第一个Java程序
    * 它将输出 Hello World
    * 这是一个多行注释的示例
    * IDEA快捷键：Ctrl+Shift+/
    */
    public static void main(String[] args){
       // 这是单行注释的示例  IDEA快捷键：Ctrl+/
       /* 这个也是单行注释的示例 */
       System.out.println("Hello World"); 
    }
}
```

### 九、继承(extends)

在 Java 中，一个类可以由其他类派生。如果你要创建一个类，而且已经存在一个类具有你所需要的属性或方法，那么你可以将新创建的类继承该类。

利用继承的方法，可以<font color="#dd0000">重用已存在类的方法和属性</font>，而不用重写这些代码。被继承的类称为**超类（super class）**，派生类称为**子类（sub class)**

**父类中声明为 private 的方法，不能够被子类继承**

### 十、接口(interface)

在 Java 中，接口可理解为<font color="#dd0000">对象间相互通信的协议</font>。接口在继承中扮演着很重要的角色。

接口只定义派生要用到的方法，但是方法的具体实现完全取决于派生类。

## Java 对象和类

https://www.runoob.com/java/java-object-classes.html

### 一、Java中的对象

拿一条狗来举例，它的状态有：名字、品种、颜色，行为有：叫、摇尾巴和跑。

对比**现实对象**和**软件对象**，它们之间十分<font color="#dd0000">相似</font>。

软件对象也有状态和行为。软件对象的**状态就是属性**，**行为通过方法体现**。

在软件开发中，*方法操作对象内部状态的改变，对象的相互调用也是通过方法来完成*

### 二、Java 中的类

类可以看成是<font color="#dd0000">创建 Java 对象的模板</font>

### 三、构造方法

每个类都有构造方法。如果没有显式地为类定义构造方法，Java 编译器将会为该类提供一个默认构造方法（无参）。

- 当写了一个有参构造方法，默认的无参构造就会失效，需要显式写一个无参构造方法，(@NoArgsConstructor)无参构造方法就会生效

```java
public class Puppy{
    public Puppy(){    //无参构造方法
    }
 
    public Puppy(String name){   //有参构造方法
        // 这个构造器仅有一个参数：name
    }
}
```

### 四、匿名类

```java
package study.dto;

import lombok.*;

import java.util.Date;

/**
 * @author: Ray
 * @date: 2023年06月30日 16:58
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Animal{

    Integer age;
    String name;
    Date birthday;

    public void housekeeping(){
        System.out.println("我会看家");
    }

    //匿名内部类
    public static class AnonymousInnerDog{
        public static void main(String[] args) {
            Dog dog = new Dog(){
                @Override
                public void housekeeping() {
                    System.out.println("我会匿名看家");
                }
            };
            dog.housekeeping();
        }
    }

}
```

## Java 基本数据类型

https://www.runoob.com/java/java-basic-datatypes.html

### 一、内置数据类型

Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。Byte、Short、Integer、Long、Float、Double、Character、Boolean

```java
基本类型：byte 二进制位数：8
包装类：java.lang.Byte
最小值：Byte.MIN_VALUE=-128
最大值：Byte.MAX_VALUE=127

基本类型：short 二进制位数：16
包装类：java.lang.Short
最小值：Short.MIN_VALUE=-32768
最大值：Short.MAX_VALUE=32767

基本类型：int 二进制位数：32
包装类：java.lang.Integer
最小值：Integer.MIN_VALUE=-2147483648
最大值：Integer.MAX_VALUE=2147483647

基本类型：long 二进制位数：64
包装类：java.lang.Long
最小值：Long.MIN_VALUE=-9223372036854775808
最大值：Long.MAX_VALUE=9223372036854775807

基本类型：float 二进制位数：32
包装类：java.lang.Float
最小值：Float.MIN_VALUE=1.4E-45
最大值：Float.MAX_VALUE=3.4028235E38

基本类型：double 二进制位数：64
包装类：java.lang.Double
最小值：Double.MIN_VALUE=4.9E-324
最大值：Double.MAX_VALUE=1.7976931348623157E308

基本类型：char 二进制位数：16
包装类：java.lang.Character
最小值：Character.MIN_VALUE=0
最大值：Character.MAX_VALUE=65535

基本类型：boolean 二进制位数：1
包装类：java.lang.Boolean
```

### 二、引用类型

- 引用类型指向一个对象，指向对象的变量是引用变量。这些变量在声明时被指定为一个特定的类型，比如 Employee、Puppy 等。变量一旦声明后，类型就不能被改变了。
- 对象、数组都是引用数据类型。

- 所有引用类型的默认值都是null。

- 一个引用变量可以用来引用任何与之兼容的类型。 例：

  ```java
  Map<String,Object> map = new HashMap<String,Object>;  //引用变量map
  ```

### 三、Java 常量

常量在程序运行时是**不能被修改**的。

在 Java 中使用 **<font color="#dd0000">final 关键字</font>**来修饰常量，声明方式和变量类似：

```java
final double PI = 3.1415927;  //变量名用大写(规范)
```

### 四、自动类型转换

```java
低  ------------------------------------>  高

byte,short,char—> int —> long—> float —> double 
```

数据类型转换必须满足如下规则：

- 不能对boolean类型进行类型转换。
- 不能把对象类型转换成不相关类的对象。
- 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。
- 转换过程中可能导致溢出或损失精度
- **自动类型转换**：short数据类型的位数为16位，就可以自动转换位数为32的int类型
- 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：

```java
(int)23.7 == 23;  
```

<font color="#dd0000">包装类不能强转哦</font>，要用对应包装类的方法转换：

```java
Float value = 10.1f;
Integer value1 = value.intValue();
```

## Java 运算符

https://www.runoob.com/java/java-operators.html

### 一、算术运算符(7)

| +    | 加法 - 相加运算符两侧的值         | A + B 等于 30                      |
| ---- | --------------------------------- | ---------------------------------- |
| -    | 减法 - 左操作数减去右操作数       | A – B 等于 -10                     |
| *    | 乘法 - 相乘操作符两侧的值         | A * B等于200                       |
| /    | 除法 - 左操作数除以右操作数       | B / A等于2                         |
| ％   | 取余 - 左操作数除以右操作数的余数 | B%A等于0                           |
| ++   | 自增: 操作数的值增加1             | B++ 或 ++B 等于 21（区别详见下文） |
| --   | 自减: 操作数的值减少1             | B-- 或 --B 等于 19（区别详见下文） |

### 二、关系运算符(6)

| ==   | 检查如果两个操作数的值是否相等，如果相等则条件为真。         | （A == B）为假。 |
| ---- | ------------------------------------------------------------ | :--------------- |
| !=   | 检查如果两个操作数的值是否相等，如果值不相等则条件为真。     | (A != B) 为真。  |
| >    | 检查左操作数的值是否大于右操作数的值，如果是那么条件为真。   | （A> B）为假。   |
| <    | 检查左操作数的值是否小于右操作数的值，如果是那么条件为真。   | （A <B）为真。   |
| >=   | 检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。 | （A> = B）为假。 |
| <=   | 检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。 | （A <= B）为真。 |

### 三、位运算符(7)

| ＆   | 如果相对应位都是1，则结果为1，否则为0                        | （A＆B），得到12，即0000 1100  |
| ---- | ------------------------------------------------------------ | ------------------------------ |
| \|   | 如果相对应位都是 0，则结果为 0，否则为 1                     | （A \| B）得到61，即 0011 1101 |
| ^    | 如果相对应位值相同，则结果为0，否则为1                       | （A ^ B）得到49，即 0011 0001  |
| 〜   | 按位取反运算符翻转操作数的每一位，即0变成1，1变成0。         | （〜A）得到-61，即1100 0011    |
| <<   | 按位左移运算符。左操作数按位左移右操作数指定的位数。         | A << 2得到240，即 1111 0000    |
| >>   | 按位右移运算符。左操作数按位右移右操作数指定的位数。         | A >> 2得到15即 1111            |
| >>>  | 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 | A>>>2得到15即0000 1111         |

### 四、逻辑运算符(3)

| &&    | 称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。     | （A && B）为假。    |
| ----- | ------------------------------------------------------------ | ------------------- |
| \| \| | 称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。 | （A \| \| B）为真。 |
| ！    | 称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。 | ！（A && B）为真。  |

### 五、赋值运算符(11)

| =       | 简单的赋值运算符，将右操作数的值赋给左侧操作数               | C = A + B将把A + B得到的值赋给C          |
| ------- | ------------------------------------------------------------ | ---------------------------------------- |
| + =     | 加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数     | C + = A等价于C = C + A                   |
| - =     | 减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数     | C - = A等价于C = C - A                   |
| * =     | 乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数     | C * = A等价于C = C * A                   |
| / =     | 除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数     | C / = A，C 与 A 同类型时等价于 C = C / A |
| （％）= | 取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数 | C％= A等价于C = C％A                     |
| << =    | 左移位赋值运算符                                             | C << = 2等价于C = C << 2                 |
| >> =    | 右移位赋值运算符                                             | C >> = 2等价于C = C >> 2                 |
| ＆=     | 按位与赋值运算符                                             | C＆= 2等价于C = C＆2                     |
| ^ =     | 按位异或赋值操作符                                           | C ^ = 2等价于C = C ^ 2                   |
| \| =    | 按位或赋值操作符                                             | C \| = 2等价于C = C \| 2                 |

### 六、条件运算符（?:）

```java
// 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
b = (a == 1) ? 20 : 30;
```

### 七、instanceof 运算符

该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）

> 用了一下感觉没什么鸟用？

### 八、Java运算符优先级

## Java 循环结构、条件语句、switch case 语句

循环结构：https://www.runoob.com/java/java-loop.html

条件语句：https://www.runoob.com/java/java-if-else-switch.html

switch case 语句：https://www.runoob.com/java/java-switch-case.html

## Java Number & Math 类

![](https://www.runoob.com/wp-content/uploads/2013/12/OOP_WrapperClass.png)



