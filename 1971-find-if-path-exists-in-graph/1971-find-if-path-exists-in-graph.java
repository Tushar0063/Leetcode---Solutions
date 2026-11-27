class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] curr : edges) {
            int from = curr[0];
            int to = curr[1];

            list.get(from).add(to);
            list.get(to).add(from);
        }

        if (source == destination)
            return true;

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.add(source);
        vis[source] = true;

        while (!q.isEmpty()) {

            int curr = q.poll();
            if (curr == destination)
                return true;

            for (int next : list.get(curr)) {

                if (vis[next] == false) {

                    vis[next] = true;
                    q.add(next);
                }
            }
        }
        return false;

    }
}