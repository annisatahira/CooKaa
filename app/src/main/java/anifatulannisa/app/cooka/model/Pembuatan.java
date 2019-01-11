package anifatulannisa.app.cooka.model;

/**
 * Created by annisatahira on 11/01/19.
 */

public class Pembuatan {
    private int img_proses;
    private String txt_tahap;

    public Pembuatan(int img_proses, String txt_tahap) {
        this.img_proses = img_proses;
        this.txt_tahap = txt_tahap;
    }

    public int getImg_proses() {
        return img_proses;
    }

    public String getTxt_tahap() {
        return txt_tahap;
    }
}
