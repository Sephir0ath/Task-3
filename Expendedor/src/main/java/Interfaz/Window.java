package Interfaz;

import javax.swing.JFrame;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.*;
import java.time.Instant;


/**
 * Clase que representa la ventana de la aplicación.
 */
public class Window extends JFrame {
    private static Window instance;

    /**
     * Constructor que ajusta las configuraciones de la Ventana.
     */
    public Window() {
        super("Expendedora");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(910, 800);
        this.setResizable(false);
        playMusic();
        PanelPrincipal panelPrincipal = new PanelPrincipal();
        this.add(panelPrincipal);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        instance = this;
    }

    /**
     * Método que obtiene la instancia de la ventana.
     * Implementación de patrón Singleton.
     * @return instancia de la ventana.
     */

    public static synchronized Window frame() {
        if (instance == null) {
            instance = new Window();
        }
        return instance;
    }


    /**
     * Método para reproducir música en un bucle mientras la ventana está activa.
     */
    public void playMusic() {
        try {
            InputStream backgroundMusic = getClass().getResourceAsStream("/musica.wav");
            if (backgroundMusic != null) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(backgroundMusic);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
                FloatControl volumen = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                volumen.setValue(-20.0f);
                clip.start();
            } else {
                System.out.println("El archivo de música que buscas no existe.");
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}

