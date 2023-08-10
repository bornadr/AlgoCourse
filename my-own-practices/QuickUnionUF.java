public class QuickUnionUF {
    private int[] id;
    public QuickUnionUF(int N){
        id = new int[N];
        for(int i=0;i < N; i++){
            id[i] = i;
        }
    }

    private int root(int i){
        if(i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i < id.length ;i++){
            sb.append(i + " ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        QuickUnionUF QU = new QuickUnionUF(10);
        System.out.println(QU);
       System.out.println(QU.connected(2,3));
       QU.union(2, 3);
       System.out.println(QU.connected(2,3));
       System.out.println(QU.root(2));
       System.out.println("root of 3 is " + QU.root(3));
}
}