public class QuickFindUF{
    private int[] id;

    public QuickFindUF(int N){
        id = new int[N];
        for(int i=0;i<N ;i++){
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
            return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i=0;i<id.length;i++){
            if (id[i] == pid) id[i] = qid;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < id.length; i++) {
            sb.append(id[i]+ " ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        QuickFindUF QF = new QuickFindUF(10);
        System.out.println(QF);
        System.out.println(QF.connected(2,3));
        QF.union(2, 3);
        System.out.println(QF.connected(2, 3));
    }
}

