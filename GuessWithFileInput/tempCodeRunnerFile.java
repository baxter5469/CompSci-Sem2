public static ArrayList<String> getList(Scanner input) {
		// Fill in the body
		ArrayList<String> list = new ArrayList<String>();
		String tempIn;
		input.useDelimiter("[^A-Za-z]+");
		while (input.hasNext()){
			tempIn = input.next();
			list.add(tempIn);
		}
		System.out.print(list);
		return list;
	}