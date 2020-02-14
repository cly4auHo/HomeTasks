package paket;

import java.lang.ref.SoftReference;

public class ReferencesTypes {
    int [][] ara = new int[1000][10000];
    SoftReference<ReferencesTypes> sof = new SoftReference<ReferencesTypes>(new ReferencesTypes());
}
