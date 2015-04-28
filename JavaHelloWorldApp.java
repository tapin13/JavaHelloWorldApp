import javax.swing.*;

public class JavaHelloWorldApp extends JFrame {
	public static void main(String[] args) {
		new JavaHelloWorldApp();
	}

	public JavaHelloWorldApp() {
		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("Hello world, this is LinuxMint first app");
		panel1.add(label1);
		this.add(panel1);
		this.setTitle("Hello world");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
