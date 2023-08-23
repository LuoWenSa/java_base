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

利用继承的方法，可以<font color="#dd0000">重用已存在类的方法和字段属性</font>，而不用重写这些代码。被继承的类称为**超类（super class）**，派生类称为**子类（sub class)**

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

https://www.runoob.com/java/java-number.html

![](https://www.runoob.com/wp-content/uploads/2013/12/OOP_WrapperClass.png)



### 一、装箱与拆箱

这种由编译器特别支持的包装称为<font color="#dd0000">装箱</font>，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。相似的，编译器也可以把一个对象<font color="#dd0000">拆箱</font>为内置类型

```java
public class Test{
 
   public static void main(String[] args){
      Integer x = 5;   //装箱
      x =  x + 10;  //拆箱后装箱
      System.out.println(x); 
   }
}
```

### 二、Java Math 类

https://www.runoob.com/java/java-number.html

Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数

```java
public class Test {  
    public static void main (String []args)  
    {  
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  
    }  
}
```



### 三、Number & Math 类方法

1. Number类常用：

```java
public class Test{
public static void main(String args[]){
    			//1.valueOf() 装箱(可接受String作为参数！)
                Integer x =Integer.valueOf(9);  
    			Integer y =Integer.valueOf("10");
                //2.xxxValue() 拆箱
    			//返回 byte 原生数据类型
                System.out.println(x.byteValue());
                //返回 double 原生数据类型
                System.out.println(x.doubleValue());
                //返回 long 原生数据类型
                System.out.println(x.longValue());
    
    			
    			//3.toString()  Number转String
        		Integer x = 5;
                System.out.println(x.toString());  
                System.out.println(Integer.toString(12)); 
    			//4.parseXxx()  String转内置数据类型-->Number
				int x =Integer.parseInt("9");
        		double c = Double.parseDouble("5");
    			
        }
}
```

2. Math 类常用：

```java
public class MathTest {
    public static void main(String[] args) {
        double x = 3.6;
        double z = 3.5;
        double y = 3.4;
        System.out.println("Math.ceil(x) = " + Math.ceil(x));
        System.out.println("Math.ceil(z) = " + Math.ceil(z));
        System.out.println("Math.ceil(y) = " + Math.ceil(y));  //向上取整 ans：4

        System.out.println("Math.floor(x) = " + Math.floor(x));
        System.out.println("Math.floor(z) = " + Math.floor(z));
        System.out.println("Math.floor(y) = " + Math.floor(y));  //向下取整 ans：3

        System.out.println("Math.round(x) = " + Math.round(x));
        System.out.println("Math.round(z) = " + Math.round(z));
        System.out.println("Math.round(y) = " + Math.round(y));  //四舍五入 alg：Math.floor(x+0.5)

        System.out.println("Math.random() = " + Math.random());  //返回值:double 范围:[0.0,1.0)

        //etc
        System.out.println("new Random().nextInt(10) = " + new Random().nextInt(10));  //0~9
    }
}

-----------------------------------
Math.ceil(x) = 4.0
Math.ceil(z) = 4.0
Math.ceil(y) = 4.0
Math.floor(x) = 3.0
Math.floor(z) = 3.0
Math.floor(y) = 3.0
Math.round(x) = 4
Math.round(z) = 4
Math.round(y) = 3
Math.random() = 0.7537938749527735
new Random().nextInt(10) = 4
```

## Java Character 类

https://www.runoob.com/java/java-character.html

```java
public class CharacterTest {
    public static void main(String[] args) {
        Character num = '1';
        Character zfSmall = 'a';
        Character zfBig = 'a';
        Character space = ' ';

        System.out.println("Character.isDigit() = " + Character.isDigit(num));  //是否是一个数字字符
        System.out.println("Character.isLetter() = " + Character.isLetter(zfSmall));  //是否是一个字母字符
        System.out.println("Character.toUpperCase() = " + Character.toUpperCase(zfSmall)); //小写字符转大写字符 a --> A
        System.out.println("Character.toLowerCase() = " + Character.toLowerCase(zfBig)); //大写字符转小写字符 A --> a
        System.out.println("Character.isWhitespace() = " + Character.isWhitespace(space)); //是否是一个空白字符
    }
}

-------------------------------
Character.isDigit() = true
Character.isLetter() = true
Character.toUpperCase() = A
Character.toLowerCase() = a
Character.isWhitespace() = true  
```

## Java String 类

https://www.runoob.com/java/java-string.html

### 一、String类型创建

0.底层还是字符数组char[]

1.String 创建的字符串存储在**公共池**中，2.而 new 创建的字符串对象在**堆**上：

```java
String s1 = "Runoob";              // String 直接创建
String s2 = "Runoob";              // String 直接创建
String s3 = s1;                    // 相同引用
String s4 = new String("Runoob");   // String 对象创建
String s5 = new String("Runoob");   // String 对象创建
```

![](https://www.runoob.com/wp-content/uploads/2013/12/java-string-1-2020-12-01.png)

**注意:**<font color="#dd0000">String 类是不可改变的，所以你一旦创建了 String 对象，那它的值就无法改变了</font>,如下图所示

![](https://www.runoob.com/wp-content/uploads/2013/12/string-no-modify.png)

### 二、String 方法

详情请见：https://www.runoob.com/java/java-string.html

### #1、使用 **==** 和 **equals()** 比较字符串

String 中 **==** 比较引用地址是否相同，**equals()** 比较字符串的内容是否相同：

```java
String s1 = "Hello";              // String 直接创建
String s2 = "Hello";              // String 直接创建
String s3 = s1;                   // 相同引用
String s4 = new String("Hello");  // String 对象创建
String s5 = new String("Hello");  // String 对象创建
 
s1 == s1;         // true, 相同引用
s1 == s2;         // true, s1 和 s2 都在公共池中，引用相同
s1 == s3;         // true, s3 与 s1 引用相同
s1 == s4;         // false, 不同引用地址
s4 == s5;         // false, 堆中不同引用地址
 
s1.equals(s3);    // true, 相同内容
s1.equals(s4);    // true, 相同内容
s4.equals(s5);    // true, 相同内容
```

### #2、String的 substring() 方法

1.public String substring(int beginIndex, int endIndex) 

 //beginIndex = 可视为字符数组下标的开始，endIndex = beginIndex + 要查询字符串的长度

2.public String substring(int beginIndex)

![](https://www.runoob.com/wp-content/uploads/2016/05/java-substring-20201208.png)

## Java StringBuffer 和 StringBuilder 类

当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。

和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。

![](https://www.runoob.com/wp-content/uploads/2013/12/java-string-20201208.png)

### 一、区别

在使用 **StringBuffer** 类时，每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象，所以如果需要对字符串进行修改推荐使用 StringBuffer，**线程相对来说安全，因为它内部每个方法都加了synchronized**。

*（如果多个线程同时访问同一个`StringBuffer`对象其中一个线程在修改该对象时，其他线程也在访问该对象，则可能会发生竞态条件。）*

**StringBuilder** 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。

由于 StringBuilder 相较于 StringBuffer **有速度优势**，所以多数情况下建议使用 StringBuilder 类。

### 二、操作方法

https://www.runoob.com/java/java-stringbuffer.html

## Java 数组

### 一、声明数组变量

<font color="#dd0000">初始化后默认元素都是0</font>

```java
double[] myList = new double[10];         // 首选的方法，初始化后默认元素都是0
double[] myList = {1,2,3,...,x};    
或
double myList[] = new double[10];         //效果相同，但不是首选方法
double myList[] = {1,2,3,...,x};
```

### 二、常用方法

java.util.Arrays 类能方便地操作数组，**它提供的所有方法都是静态**的。

例：

- 给数组赋值：通过 fill 方法。
- 对数组排序：通过 sort 方法,按升序。
- 比较数组：通过 equals 方法比较数组中元素值是否相等。
- 查找数组元素：通过 binarySearch 方法能对排序好的数组进行二分查找法操作。

## Java 日期时间

https://www.runoob.com/java/java-date-time.html

### 一、日期比较

Java使用以下三种方法来比较两个日期：

- 使用 **getTime()** 方法获取两个日期（自1970年1月1日经历的毫秒数值），然后比较这两个值。
- 使用方法 **before()，after() 和 equals()**。例如，一个月的12号比18号早，则 new Date(99, 2, 12).before(new Date (99, 2, 18)) 返回true。
- 使用 **compareTo()** 方法，它是由 Comparable 接口定义的，Date 类实现了这个接口。

### 二、使用 SimpleDateFormat 格式化日期

```java
//使用 SimpleDateFormat 格式化日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //1.date --> String
        System.out.println("simpleDateFormat.format(d) = " + simpleDateFormat.format(d));
        try {
            //2.String --> date
            System.out.println("simpleDateFormat.parse() = " + simpleDateFormat.parse("2023-05-13 09:53:23"));
        } catch (ParseException e) {
            System.out.println("抛出异常后。。。");
            throw new RuntimeException(e);
        }
```

### 三、Java 休眠(sleep)

```java
        try {
            Thread.sleep(1000*3);   //休眠3秒
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
```

### 四、Calendar类

**特点：**

1.能设置和**获取日期数据的特定部分**呢，比如说小时，日，或者分钟

2.在日期的这些部分**加上或者减去值**

3.Calendar类的功能要比Date类强大很多，而且在实现方式上也比Date类要复杂一些。

4.Calendar类是一个抽象类

```java
//创建一个代表系统当前日期的Calendar对象
Calendar c = Calendar.getInstance();//默认是当前日期

//设置日期为2023年5月13日
c.set(2023, Calendar.MAY,13);

//set只设定某个字段，其他年、日等同理
c.set(Calendar.MONTH,Calendar.FEBRUARY); //将月份设置为2月

//Add设置
c.add(Calendar.DATE, 20);  //日期加上20天，其他的所有数值会被重新计算

//Calendar类对象信息的获得
Calendar c1 = Calendar.getInstance();
// 获得年份
int year = c1.get(Calendar.YEAR);
// 获得月份
int month = c1.get(Calendar.MONTH) + 1;
// 获得日期
int date = c1.get(Calendar.DATE);
// 获得小时
int hour = c1.get(Calendar.HOUR_OF_DAY);
// 获得分钟
int minute = c1.get(Calendar.MINUTE);
// 获得秒
int second = c1.get(Calendar.SECOND);
// 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
int day = c1.get(Calendar.DAY_OF_WEEK); //1-7 --> 星期日-星期六
```

### 五、GregorianCalendar类

Calendar类实现了公历日历，GregorianCalendar是Calendar类的一个具体实现。

## Java 正则表达式

https://www.runoob.com/java/java-regular-expressions.html

java.util.regex 包主要包括以下三个类：

- **Pattern 类**：

  pattern 对象是一个**正则表达式的编译表示**。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。

- **Matcher 类**：

  Matcher 对象是**对输入字符串进行解释和匹配操作的引擎**。与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。

- **PatternSyntaxException**：

  PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。