package oops;
public class Fraction{
    public static int gcd(Fra f){
        int min=Math.min(f.n,f.d);
        
        for(int i=min;i>0;i--){
            if(f.n%i==0 && f.d%i==0){
                return i;
            }

        }
        return 1;
    }

    static class Fra{
        int n;
        int d;
        Fra(int n,int d){
            this.n=n;
            this.d=d;
        }
        static Fra sub(Fra f1,Fra f2){
            int N=(f1.n*f2.d-f2.n*f1.d);
            int D=(f1.d*f2.d);
            Fra ans=new Fra(N,D);
            simplify(ans);
            return ans;
        }

        static Fra add(Fra f1,Fra f2){
            int N=(f1.n*f2.d+f2.n*f1.d);
            int D=(f1.d*f2.d);
            Fra ans=new Fra(N,D);
            simplify(ans);
            return ans;
        }
        static void simplify(Fra f){
            int g=gcd(f);
            f.n=f.n/g;
            f.d=f.d/g;
        }

    }


    public static void main(String[] args) {
        Fra f1=new Fra(1,2);
        Fra f2=new Fra(3,4);
        Fra result=Fra.add(f1, f2);
        System.out.println("ans is:"+result.n+"/"+result.d);
        
        


    
    }

}