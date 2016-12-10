package jp.MiuKisaragi.HeartIsHopping;
import java.util.ArrayList;
import java.util.List;

public class HeartIsHoppingGeneratorEngine {
	private static final String go = new String("ご");
	private static final String chi = new String("ち");
	private static final String u = new String("う");
	private static final String sa = new String("さ");
	private static final String hopping = new String("あぁ^～心がぴょんぴょんするんじゃぁ^～");
	private List<String> output= new ArrayList<String>();
	private String gochiusa = "";

	private boolean checkGoChiUSa(){
		gochiusa = String.join("", (String[])output.toArray(new String[0]));
		if(gochiusa.equals("ごちうさ")){
			return true;
		}else {
			return false;
		}
	}

	public void hopping(){
		for(;checkGoChiUSa() == false;){
			print();	
		}
		System.out.println("");
		System.out.println(hopping);
		return;
	}

	private void print(){
		switch (calc()){
		case 0:
			outputValue(go);
			return;
		case 1:
			outputValue(chi);
			return;
		case 2:
			outputValue(u);
			return;
		case 3:
			outputValue(sa);
			return;
		}
	}
	private void outputValue(String value){
		System.out.print(value);
		output.add(value);
		if(output.size() > 4){
			output.remove(0);
		}
	}

	private int calc(){
		return (int)(Math.floor((Math.random() * 4)));
	}
}
