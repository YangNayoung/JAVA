

import java.io.*;
import java.util.StringTokenizer;

class sungDatasExam {
	public void readingData(String fname) throws IOException {
		try {
			String fname = null;
			FileReader fr = new FileReader(new File(fname));
			BufferedReader br = new BufferedReader(fr);
			String csvStr = "";
			String tmpStr = "";
			do {
				tmpStr = br.readLine();
				if(tmpStr != null) {
					csvStr += tmpStr + "\t";
				}
			}
			while(tmpStr != null);
			StringTokenizer parsee = new StringTokenizer(csvStr, "\t");
			StringTokenizer parse = null;
			int length = parse.countTokens()/4;
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			for(int i = 0; i < length; i++) {
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = math[i] = english[i];
				avg[i] = total[i]/2.0;
			}
			for(int j = 0; j < length; j++) {
				System.out.println(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] + "\t" + total[j] + "\t" + avg[j]);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("�옒紐삳맂 �뙆�씪 �씠由꾩쓣 �엯�젰�뻽�뒿�땲�떎.");
		}

	}

}
class sungDatasMain {
	public static void main(String[] args) {
		sungDatasExam wd = new sungDatasExam();
		try {
			wd.readingData("writed.txt");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}