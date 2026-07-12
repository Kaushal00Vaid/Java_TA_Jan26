
package W4;

import java.util.*;

// Define MLModel abstract class
abstract class MLModel {
    abstract void train();

    abstract void evaluate();
}

class XGBoost extends MLModel {
    // instance variable
    private int numTrees;

    // constructor
    public XGBoost(int _numTrees) {
        this.numTrees = _numTrees;
    }

    // Override train() method
    void train() {
        System.out.println("XGBoost: Training with " + numTrees + " trees.");
        evaluate();
    }

    // Override evaluate() method
    void evaluate() {
        if (numTrees >= 100) {
            System.out.println("Accuracy: 95% - Ready for Kaggle");
        } else {
            System.out.println("Accuracy: 75% - Needs more estimators");
        }
    }
}

class LightGBM extends MLModel {
    // instance variable
    private int numTrees;

    // constructor
    public LightGBM(int numTrees) {
        this.numTrees = numTrees;
    }

    // Override train() method
    public void train() {
        System.out.println("LightGBM: Fast training with " + numTrees + " trees.");
        evaluate();
    }

    // Override evaluate() method
    public void evaluate() {
        if (numTrees >= 100) {
            System.out.println("Accuracy: 96% - Top of leaderboard");
        } else {
            System.out.println("Accuracy: 78% - Needs tuning");
        }
    }
}

class DataScientist {
    public void runPipeline(MLModel model) {
        model.train();
    }
}

public class MLTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trees1 = sc.nextInt(); // 50
        int trees2 = sc.nextInt(); // 150
        DataScientist ds = new DataScientist();

        XGBoost xgb = new XGBoost(trees1);
        LightGBM lgb = new LightGBM(trees2);

        ds.runPipeline(xgb);
        ds.runPipeline(lgb);
    }
}
