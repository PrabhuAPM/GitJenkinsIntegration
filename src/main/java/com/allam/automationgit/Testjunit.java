package com.allam.automationgit;




public class Testjunit {
	
	public static void main(String args[])
	{
		System.out.println("Welcome to Jenkins");
	}

	/*WebDriver driver=null;
	@Test
	public void sampletest()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Hi Welcome to Github, Jenkins and Maven");
	}
	*/
	
	/*@Test
	public void readexcel() throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("Testdata.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		Iterator<Row> rowitr = sheet.iterator();
		
		while(rowitr.hasNext()) {
			Row row = rowitr.next();
		Iterator<Cell> cellitr = row.iterator();

		while(cellitr.hasNext()) {
			Cell cell= cellitr.next();
			
			switch(cell.getCellType()){
			case Cell.CELL_TYPE_NUMERIC:
				System.out.println(cell.getNumericCellValue());
				break;
			case Cell.CELL_TYPE_STRING:
				System.out.println(cell.getStringCellValue());
				break;
			}
		}
		System.out.println(" ");
		
	}
	
	}*/
	
}
