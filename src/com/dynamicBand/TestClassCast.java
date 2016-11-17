package com.dynamicBand;


/**
 * 父类Animal
 * @author gacl
 *
 */
class Animals {

    public String name;

    public Animals(String name) {
        this.name = name;
    }
    public void a1(){
    	System.out.println("a1");
    }
    public void enjoy(){
    	System.out.println("animals run");
    }
}

/**
 * 子类Cat继承Animal
 * @author gacl
 *
 */
class Cats extends Animals {

    /**
     * Cat添加自己独有的属性
     */
    public String eyeColor;

    public Cats(String n, String c) {
        super(n);//调用父类Animal的构造方法
        this.eyeColor = c;
    }
    public void c1(){
    	System.out.println("c1");
    }
    public void enjoy(){
    	System.out.println("cats run");
    }
}

/**
 * 子类Dog继承Animal
 * @author gacl
 *
 */
class Dogs extends Animals {
    /**
     * Dog类添加自己特有的属性
     */
    public String furColor;

    public Dogs(String n, String c) {
        super(n);//调用父类Animal的构造方法
        this.furColor = c;
    }
    public void enjoy(){
    	System.out.println("dogs run");
    }

}

/**
 * 下面是这三个类的测试程序
 * @author gacl
 *
 */
public class TestClassCast {

    /**
     * @param args
     */
	public static void testC(Animals c){
		if(c instanceof Cats){
			((Cats)c).c1();
		}
	}
    public static void main(String[] args) {

        /*Animals a = new Animals("name");
        Cats c = new Cats("catname","blue");
        Dogs d = new Dogs("dogname", "black");
        *//**
         * a instanceof Animal这句话的意思是a是一只动物吗？
         * a是Animal这个类里面的是一个实例对象，所以a当然是一只动物，其结果为true。
         *//*
        System.out.println(String.format("a instanceof Animal的结果是%s",a instanceof Animals));//true
        *//**
         * c是Cat类的实例对象的引用，即c代表的就是这个实例对象，
         * 所以“c是一只动物”打印出来的结果也是true。
         * d也一样，所以“d是一只动物”打印出来的结果也是true。
         *//*
        System.out.println(String.format("c instanceof Animal的结果是%s",c instanceof Animals));//true
        System.out.println(String.format("d instanceof Animal的结果是%s",d instanceof Animals));//true
        *//**
         * 这里判断说“动物是一只猫”，不符合逻辑，所以打印出来的结果是false。
         *//*
        System.out.println(String.format("a instanceof Cat的结果是%s",a instanceof Cats));
        *//**
         * 这句话比较有意思了，a本身是Animal类的实例对象的引用，
         * 但现在这个引用不指向Animal类的实例对象了，而是指向了Dog这个类的一个实例对象了，
         * 这里也就是父类对象的引用指向了子类的一个实例对象。
         *//*
        a = new Dogs("bigyellow", "yellow");
        System.out.println(a.name);//bigyellow
        *//**
         * 这里的furColor属性是子类在继承父类的基础上新增加的一个属性，是父类没有的。
         * 因此这里使用父类的引用对象a去访问子类对象里面新增加的成员变量是不允许的，
         * 因为在编译器眼里，你a就是Animal类对象的一个引用对象，你只能去访问Animal类对象里面所具有的name属性，
         * 除了Animal类里面的属性可以访问以外，其它类里面的成员变量a都没办法访问。
         * 这里furColor属性是Dog类里面的属性，因此你一个Animal类的引用是无法去访问Dog类里面的成员变量的，
         * 尽管你a指向的是子类Dog的一个实例对象，但因为子类Dog从父类Animal继承下来，
         * 所以new出一个子类对象的时候，这个子类对象里面会包含有一个父类对象，
         * 因此这个a指向的正是这个子类对象里面的父类对象，因此尽管a是指向Dog类对象的一个引用，
         * 但是在编译器眼里你a就是只是一个Animal类的引用对象，你a就是只能访问Animal类里面所具有的成员变量，
         * 别的你都访问不了。
         * 因此一个父类(基类)对象的引用是不可以访问其子类对象新增加的成员(属性和方法)的。
         *//*
        //System.out.println(a.furColor);
        System.out.println(String.format("a指向了Dog，a instanceof Animal的结果是%s",a instanceof Animals));//true
        *//**
         * 这里判断说“a是一只Dog”是true。
         * 因为instanceof探索的是实际当中你整个对象到底是什么东西，
         * 并不是根据你的引用把对象看出什么样来判断的。
         *//*
        System.out.println(String.format("a instanceof Dog的结果是%s",a instanceof Dogs));//true
        *//**
         * 这里使用强制转换，把指向Animal类的引用对象a转型成指向Dog类对象的引用，
         * 这样转型后的引用对象d1就可以直接访问Dog类对象里面的新增的成员了。
         *//*
        Dogs d1 = (Dogs)a;
        System.out.println(d1.furColor);//yellow
*/        
        
        
        
        Animals animals = new Animals("animal");
        animals.enjoy();
        animals = new Cats("asa", "as");
        animals.enjoy();//动态绑定
        testC(animals);//对象转型
    }

}
