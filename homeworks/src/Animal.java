abstract class Animal{
    public abstract String eat();
}
class Cat implements Animal {
    public String speak() {
        return "Miy";
    }
}

class Dog extends Animal{

    @Override
    public String eat() {
        return "Bone";
    }
}

interface Unknowable {
    public boolean isNotknown = true;
    public void set(Number number);
    public void delete();
}
class MyKnow  implements Unknowable  {
    public boolean isNotknown = true;
    public String name;
    public void print(){};
    @Override
    public void delete() {

    }
    public void set(Number number) {

    }
}
interface Drawable{
    public void draw();
}
class MyClass implements Drawable{
    public boolean drawing;
    public void start(){

    }
    public void stop(){

    }
    @Override
    public void draw() {

    }
}