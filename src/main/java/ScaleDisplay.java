import javax.swing.*;

public class ScaleDisplay {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame f = new JFrame();
			JLabel l = new JLabel("test");
			l.addPropertyChangeListener("graphicsConfiguration",
				e -> l.setText(Double.toString(l.getGraphicsConfiguration().getDefaultTransform().getScaleX())));
			l.setFont(l.getFont().deriveFont(48f));
			f.add(l);
			f.setSize(300, 200);
			f.setLocationRelativeTo(null);
			f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			f.setVisible(true);
		});
	}
}

