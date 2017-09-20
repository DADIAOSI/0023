package calcpackage;

 class AddOptioner extends Optioner {
    @Override
    public int getReuslt() {
        return getoNumFirst() + getoNumSecond();
    }
}

 class SubOptioner extends Optioner {
    @Override
    public int getReuslt() {
        return getoNumFirst() - getoNumSecond();
    }
}
 class MulOptioner extends Optioner {
    @Override
    public int getReuslt() {
        return getoNumFirst() * getoNumSecond();
    }
}
 class DivOptioner extends Optioner {
    @Override
    public int getReuslt() {
        if (getoNumSecond() == 0) {
            System.out.println("除数不能为0");
            return -1;
        } else {
            return getoNumFirst() / getoNumSecond();
        }
    }
}
  class OptionerFactory {
	    public static Optioner createOptioner(String opt) {
	        Optioner optioner = null;
	        switch (opt) {
	            case "+":
	                optioner = new AddOptioner();
	                break;
	            case "-":
	                optioner = new SubOptioner();
	                break;
	            case "*":
	                optioner = new MulOptioner();
	                break;
	            case "/":
	                optioner = new DivOptioner();
	                break;
	        }
	        return optioner;
	    }
	}
