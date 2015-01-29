package domains;

import java.io.File;
import java.io.IOException;

import loci.formats.FormatException;
//import loci.formats.ImageReader;
//import loci.formats.MetadataTools;
//import loci.formats.meta.IMetadata;
import loci.plugins.BF;
import loci.plugins.in.ImporterOptions;
import net.imglib2.img.ImagePlusAdapter; 


public class Domains {
	
	public String id;
    public String name;
    public String dir;      // set the default directory 
    private boolean abberation_correction = false;
    private boolean process_domains = false;
    private boolean verbose = true; 
    private double max_area = 5000.0;			//set maximum for domain size in particle analysis
    private double min_area = 0.0;			//set maximum for domain size in particle analysis
    private static double min_circ = 0.01;
    private static double max_circ = 1.0;
	
	 private String experiment = "experiment";
	 private String batch;
	    
	 public void setMax_Area(double _max_area){
	    	max_area = _max_area;
	 }
	    
	 public void setMin_Area(double _min_area){
	    	min_area = _min_area;
	 }
	    
	 public void setAbberation_Correction(boolean _abberation_correction ){
	    	abberation_correction = _abberation_correction;
	 }
	    
	 public void setProcess_domains(boolean _process_domains ){
	    	process_domains = _process_domains;
	 }
	    
	 public void setExperiment(String _experiment){
	    	experiment = _experiment;
	 }
	    
	 public void setVerbose(boolean verbose) {
			// TODO Auto-generated method stub
	 }
	 
	 public void run()
	 {
		 //dir = OpenDialog.getDefaultDirectory();
	    	
	     //OpenDialog.setDefaultDirectory(dir);
	     //OpenDialog od = new OpenDialog("Open Leica .lei file ...");  // no filter options in OpenDialog
	        
	     //dir = od.getDirectory();
	     //name = od.getFileName();
	     //id = dir + name;
	     //String img_name;
	 }

}
