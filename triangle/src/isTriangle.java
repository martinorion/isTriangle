public class isTriangle {
    static void main(String[] args){
  System.out.println(Triangle(2,5,2));
    }

    static boolean Triangle(int a, int b, int c){
    if(a + b > c){
        return true;
    }
    else if (b + c > a){
        return true;
    }
    else if (a + c > b){
        return true;
    }
        return false;
    }
}
