public class Slot {
    public static boolean winOrLose(Variables variables) {
        if (variables.random1 == variables.random2 && variables.random2 == variables.random3 && variables.random3 == variables.random4 && variables.random4 == variables.random5 && variables.random5 == variables.random6) {
            return true;
        } else {
            return false;
        }
    }
}