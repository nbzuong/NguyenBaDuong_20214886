package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class MediaStore extends JPanel {
    private Media media;
    private JButton playButton;
    private JButton addToCartButton;

    public MediaStore (Media media){
        this.media = media;
        playButton = new JButton("Play");
        addToCartButton = new JButton("Add to cart");

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel(""+media.getCost()+" $");
        cost.setAlignmentX(CENTER_ALIGNMENT);
        
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        container.add(new JButton("Add to cart"));
        if (media instanceof Playable) {
            playButton.addActionListener(m -> playMedia());
            container.add(playButton);
        }

        addToCartButton.addActionListener(m -> addToCart());

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    private void playMedia() {
        JDialog play = new JDialog();
        play.setSize(600, 300);
        play.setTitle("Playing media");
        
        JLabel playing = new JLabel("Playing "+ media.toString());
        playing.setFont(new Font(playing.getFont().getName(), Font.PLAIN, 20));
        playing.setAlignmentX(CENTER_ALIGNMENT);
        play.add(playing);

        play.setVisible(true);
    }

    private void addToCart() {
        StoreScreen.cart.addMedia(media);
    }
}
