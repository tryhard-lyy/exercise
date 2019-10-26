tatic Map<String, String> phone = new HashMap<String, String>() {{
	    put("2", "abc");
	    put("3", "def");
	    put("4", "ghi");
	    put("5", "jkl");
	    put("6", "mno");
	    put("7", "pqrs");
	    put("8", "tuv");
	    put("9", "wxyz");
	  }};
	public static List<String> letterCombinations(String digits) {
		List<String> answer = new ArrayList<String>();
		if(digits.length() == 0) return answer;
		  int num = digits.length();
		  backtrack(answer, digits, "", num);
		  return answer;
	}
	
	//结果集， 选择列表， 决策路径
	public static String backtrack(List<String> answer, String digits, String track, int num) {
		if(track.length() == num) {
			answer.add(track);
			return track.substring(0, track.length()-1);
		} else {
			String choiceLists = digits.substring(0, 1);
			String choiceList = phone.get(choiceLists);
			//n叉树遍历
			for(int i = 0;i < choiceList.length();i++) {
				track += "" + choiceList.charAt(i);
				//在递归之前track的值已经改变了，因此会影响后面的结果。
				track = backtrack(answer, digits.substring(1), track, num);
			}
		}
		return track.length() == 0 ? "" : track.substring(0, track.length()-1);
	}
	
	public static void main(String[] args) {
		List<String> res = letterCombinations("234");
		System.out.println(res.toString());
	}
