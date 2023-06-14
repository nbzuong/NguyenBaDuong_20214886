package hust.soict.dsai.aims.screen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame {
    private Store store;
    public static Cart cart;
    
    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add DVD"));
        smUpdateStore.add(new JMenuItem("Add CD"));

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View Store"));
        menu.add(new JMenuItem("View Cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        
        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View Cart");
        cart.setPreferredSize(new Dimension(100,50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i=0; i<9; i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }
        return center;
    }

    public StoreScreen(Store store){
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024,768);
    }

    public static void main(String[] args) {
        Store store = new Store();

        // Create and add random media to store
        Media media1 = new CompactDisc(1, "Media 1", "Media 1", 1.0f);
        Media media2 = new DigitalVideoDisc(2, "Media 2", "Media 2", 2.0f);
        Media media3 = new Book(3, "Media 3", "Media 3", 3.0f);
        Media media4 = new CompactDisc(4, "Media 4", "Media 4", 4.0f);
        Media media5 = new DigitalVideoDisc(5, "Media 5", "Media 5", 5.0f);
        Media media6 = new Book(6, "Media 6", "Media 6", 6.0f);
        Media media7 = new CompactDisc(7, "Media 7", "Media 7", 7.0f);
        Media media8 = new DigitalVideoDisc(8, "Media 8", "Media 8", 8.0f);
        Media media9 = new Book(9, "Media 9", "Media 9", 9.0f);
        Media media10 = new CompactDisc(10, "Media 10", "Media 10", 10.0f);
        store.addMedia(media1);
        store.addMedia(media2);
        store.addMedia(media3);
        store.addMedia(media4);
        store.addMedia(media5);
        store.addMedia(media6);
        store.addMedia(media7);
        store.addMedia(media8);
        store.addMedia(media9);
        store.addMedia(media10);
        
        StoreScreen storeScreen = new StoreScreen(store);

        // Exit button
        storeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
