		import java.text.SimpleDateFormat;
		import java.util.Date;

		import javax.swing.JOptionPane;
		
public class StringDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat ("dd.mm.yyyy");
				String s = sdf.format(d);
				System.out.println(s);
				JOptionPane.showMessageDialog(null, (s));


			
			
			


	}

}
