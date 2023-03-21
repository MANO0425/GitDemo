package testpackage;


	import java.io.File;
import java.io.IOException;


		public static void main(String[] args) throws IOException  
		{                                                       //resume aney manm rasamu(filename)
			File f= new File("C:\\Users\\HOME\\Desktop\\TestFilesHYR\\resume.txt");
			//File f= new File("./resume.txt");//(.) file aneydhi hyr project properties diayagram click chystey danilo vastundhi
			//System.out.println(f.exists());//file layakapthey false file vunttey true chybutundhi. 
			//System.out.println(f.delete());//file delate chydaniki
			//System.out.println(f.createNewFile());//create file chyyali anttey*/
			//krindha vidanga kuda rayavacchu
			//System.out.println(f.isHidden());//file hide lo kuda paytti vundho laydho chudavacchu
			//System.out.println(f.canWrite());//read vundhi kabatti radhu
			//System.out.print(f.canWrite());//vokka veyla hide chystey un hide chyyocchu
			if(f.exists())
					f.delete();
					System.out.println(f.createNewFile());
		}
	}


