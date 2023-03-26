    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int m=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        int n=in.nextInt();
        int k=in.nextInt();

        for(int i=0 ;i<n;i++)
        {
            int num=in.nextInt();
            if(deque.size()<k)
            { 
                deque.add(num);
                set.add(num);
            m=set.size();
            }

            else{
                if(set.size()>m)
                m=set.size();


                Object ob=deque.poll();
                if(!deque.contains(ob))
                set.remove(ob);
                deque.add(num);
                set.add(num);

            }

        }
        System.out.print(m);
    }
}


