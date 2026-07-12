package W4;

import java.util.*;

// Define interface AudioProcessor
interface AudioProcessor {
    void extractFeatures(int[] frequencies);
}

// Define class MelSpectrogram
class MelSpectrogram implements AudioProcessor {

    public void extractFeatures(int[] frequencies) {
        int sum = 0;

        // 1st way --> for i in l:
        /*
         * for(Integer i : frequencies) {
         * if(i > 1000) {
         * sum += i;
         * }
         * }
         */

        // 2nd way --> for i in range(len(l))
        for (int i = 0; i < frequencies.length; i++) {
            int freq = frequencies[i];
            if (freq > 1000) {
                sum += freq;
            }
        }

        System.out.println("High frequency sum: " + sum);
    }
}

// Define class NoiseFilter
class NoiseFilter implements AudioProcessor {
    public void extractFeatures(int[] frequencies) {
        int count = 0;

        for (Integer i : frequencies) {
            if (i < 50) {
                count++;
            }
        }

        System.out.println("Noise interference count: " + count);
    }
}

public class AudioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] freqs = new int[n];
        for (int i = 0; i < n; i++) {
            freqs[i] = sc.nextInt();
        }

        AudioProcessor mel = new MelSpectrogram();
        AudioProcessor filter = new NoiseFilter();

        mel.extractFeatures(freqs);
        filter.extractFeatures(freqs);
    }
}
