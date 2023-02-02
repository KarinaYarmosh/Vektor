public class Vektor {
    //zal
    public static float[] sum(float[] first, float[] second) {

        float[] result = new float[first.length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i] + second[i];
        }

        return result;
    }

    //zal
    public static float[] substract(float[] first, float[] second) {

        float[] result = new float[first.length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i] - second[i];
        }

        return result;
    }

    //zal
    public static float[] multiply(float[] first, float[] second) {

        float[] result = new float[first.length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i] * second[i];
        }

        return result;
    }

    public static float dotProduct(float[] first, float[] second) {

        float[] result = new float[first.length];

        float sum = 0;

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i] * second[i];
        }

        for (int i = 0; i < result.length; i++) {
            sum = sum + result[i];
        }

        return sum;
    }

    //pol zal
    public static float[] multiply_skalar(float[] first, float skal) {

        float[] result = new float[first.length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i] * skal;
        }

        return result;
    }

    public static float[] divide(float[] first, float skal) {

        float[] result = new float[first.length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i] / skal;
        }

        return result;
    }

    public static float[] crossProduct(float[] first, float[] second) {

        float[] result = new float[first.length];

        for (int i = 0; i < first.length; i++) {
            if(i==0) {
                result[i] = (first[i]*second[i+1])-(first[i+1]*second[i]);
            } else if (i==1) {
                result[i] = (-1) * (first[i-1]*second[i+1])-(first[i]*second[i-1]);
            } else if (i==2) {
                result[i] = (first[i-2]*second[i-1])-(first[i-1]*second[i-2]);
            }  else {
                result[i]=0;
            }
        }

        return result;
    }
    public static float[] iloczyn_mieszany(float[] first, float[] second, float[] third) {

        float[] result = new float[first.length];
        float[] result1 = new float[first.length];

        for (int i = 0; i < first.length; i++) {
            if(i==0) {
                result[i] = (first[i]*second[i+1])-(first[i+1]*second[i]);
            } else if (i==1) {
                result[i] = -1 * (first[i-1]*second[i+1])-(first[i]*second[i-1]);
            } else if (i==2) {
                result[i] = (first[i-2]*second[i-1])-(first[i-1]*second[i-2]);
            }  else {
                result[i]=0;
            }
        }

        for (int i = 0; i < first.length; i++) {
            result1[i] = result[i] * third[i];
        }

        return result1;
    }

}