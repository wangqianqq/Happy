//类中可以定义多个泛型
class More<K,V>{
    K name;
    V age;
    public More(K name, V age) {
        this.name = name;
        this.age = age;
    }
    public K show(){ 
        return name;
   }
}
public class Test<T> {
    public Test(T A) {  
        System.out.println(A);
     }
    public static void main(String[] args) {
       Test<String> test =
       new Test<String>("hello"); 
       More<String, Integer> more = 
      new More<String, Integer>("lilei", 20);
   }
}
