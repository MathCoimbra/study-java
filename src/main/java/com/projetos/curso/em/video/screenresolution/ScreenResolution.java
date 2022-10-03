package com.projetos.curso.em.video.screenresolution;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ScreenResolution {
	
    public static void main(String[] args) {
        Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("Your screen resolution is "+d.width + " X " +d.height);
    }
}
