package W4;

import java.util.*;

interface Executable {
    void executeNode(String data);
}

class WorkflowManager {
    // Define private inner class TriggerNode implementing Executable
    private class TriggerNode implements Executable {
        public void executeNode(String str) {
            System.out.println("Trigger activated by: " + str);

            // str = "executable my_webhook" --> true
            // str = "oeugfuqbwf" --> false
            if (str.contains("webhook")) {
                System.out.println("Valid trigger payload.");
            }
        }
    }

    // Define private inner class ActionNode implementing Executable
    private class ActionNode implements Executable {
        public void executeNode(String data) {
            data = data.toUpperCase();
            System.out.println("Action executed payload: " + data);
        }
    }

    // Define getTrigger() method
    // access_modifier static/non-static returnType funcName(args)

    public Executable getTrigger() {
        TriggerNode t = new TriggerNode();
        return t;
    }

    // Define getAction() method
    public Executable getAction() {
        ActionNode t = new ActionNode();
        return t;
    }
}

public class NodeflowTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String payload = sc.nextLine();
        sc.close();

        WorkflowManager engine = new WorkflowManager();
        Executable trigger = engine.getTrigger();
        Executable action = engine.getAction();

        trigger.executeNode(payload);
        action.executeNode(payload);
    }
}
