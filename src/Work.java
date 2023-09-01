public class Work {
    public void add(Variables variables) {
        Icons icons = new Icons();
        if (Slot.winOrLose(variables)) {
            icons.items(variables);
            System.out.println("\n----------\nWin\n----------");
        } else {
            icons.items(variables);
            System.out.println("\n----------\nLose\n----------");
        }
    }
}