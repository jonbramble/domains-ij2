package domains;

//import net.imagej.Dataset;
//import net.imagej.DatasetService;
import net.imagej.ImageJ;
//import net.imagej.axis.Axes;
//import net.imagej.axis.AxisType;
//import net.imglib2.type.numeric.integer.UnsignedByteType;


import org.scijava.ItemIO;
//import org.scijava.ItemIO;
import org.scijava.command.Command;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;


@Plugin(name = "Domains", type = Command.class, headless = true, menuPath = "Plugins>Domains>Domains")
public class Domains_ implements Command {
	
	@Parameter(type = ItemIO.INPUT, label = "Min Domain Area") 
	private double domain_min = 0.0;
	
	@Parameter(label = "Max Domain Area")
	private double domain_max = 5000.0;
	
	@Parameter(label = "Run Processing")
	private boolean process_domains = true;
	
	@Parameter(label = "Remove Abberations")
	private boolean abberation_correction = true;
	
	@Parameter(label = "Verbose")
	private boolean verbose = false;
	
	@Override
	public void run() {

		Domains md = new Domains();
		md.setAbberation_Correction(abberation_correction);
		md.setProcess_domains(process_domains);
		md.setVerbose(verbose);
		//md.setExperiment(experiment);
		md.setMax_Area(domain_max);
		md.setMin_Area(domain_min);
		md.run();
		
	}
	
	/*@Parameter
	private DatasetService datasetService;

	}
	*/

	/** Tests our command. */
	public static void main(final String... args) throws Exception {
		// Launch ImageJ as usual.
		final ImageJ ij = net.imagej.Main.launch(args);

		// Launch the "Gradient Image" command right away.
		ij.command().run(Domains_.class, true);
	}



}
