/*
 *  @(#)ShannonsTheorem.java   1.0 YY/MM/DD
 *
 *
 *  This software contains confidential and proprietary information
 *  of Dyer Consulting ("Confidential Information").  You shall not disclose
 *  such Confidential Information and shall use it only in accordance with the
 *  terms of the license agreement you entered into with Dyer Consulting.
 *
 *  This software is provided "AS IS,".  No warrantee of any kind, express
 *  or implied, is included with this software; use at your own risk, responsibility
 *  for damages (if any) to anyone resulting from the use of this software rests
 *  entirely with the user even if Dyer Consulting has been advised of the
 *  possibility of such damages.
 *
 *  This software is not designed or intended for use in on-line control of
 *  aircraft, air traffic, aircraft navigation or aircraft communications; or in
 *  the design, construction, operation or maintenance of any nuclear
 *  facility. Licensee represents and warrants that it will not use or
 *  redistribute the Software for such purposes.
 *
 *  Distribute freely, except: don't remove my name from the source or
 *  documentation, mark your changes (don't blame me for your possible bugs),
 *  don't alter or remove any of this notice.
 */


package network;													/*	Package for class placement	*/

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * descrived about the Shannon's theorem.
 * @author    Jean Ko
 * @version   1.0.0   2017. 1. 23.
 */
public class ShannonsTheorem	{

	/* ATTRIBUTES	-----------------------------------------------------	*/
	/* TODO:	Place Attributes here.													*/
    
	/**
     * applicable wave frequency. 
     */
    private double bandwidth;
    /**
     * How much noise occurs in the signal
     */
    private double signalToNoise;

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 *	Default constructor.
     *	the bandwidth and signalToNoise will be zero.
	 */
	public ShannonsTheorem(){
		this(0, 0);
	}
	/**
     * Parameterized constructor 
	 * @param h bandwidth
	 * @param snr signalToNoise  signalToNoise should not be smaller than 0. if then set the signalToNoise into 0. 
	 */
	public ShannonsTheorem(double h, double snr){
		super();
		bandwidth = h;
		if (snr < 0)
			snr = 0;
		signalToNoise = snr;
	}

	/* ACCESSORS	-----------------------------------------------------	*/

    /**
     * getter for bandwidth 
     * @return bandwidth;
     */
    public double getBandwidth()
    {
        return bandwidth;
    }
    /**
     * getter for signalToNoise 
     * @return signalToNoise ;
     */
    public double getSignalToNoise()
    {
        return signalToNoise;
    }

	/* MODIFIERS	-----------------------------------------------------	*/

    /**
     * setter for Bandwidth
     * @param h bandwidth
     */
    public void setBandwidth(double h) {
        bandwidth = h;
    }

    /**
     * setter for Signal to Noise
	 * @param snr signalToNoise  signalToNoise should not be smaller than 0. if then set the signalToNoise into 0. 
     */
    public void setSignalToNoise(double snr) {
		if (snr < 0)
			snr = 0;
        signalToNoise = snr;
    }


	/*	NORMAL BEHAVIOR -------------------------------------------------	*/

	/**
     * Calculate and retern the value of the Maximum DataRate for the certain bandwidth and signalToNoise. 
	 * @param hertz  bandwidth
	 * @param signalToNoise  signal to Noise
	 * @return MaximumDataRate
	 */
	private double getMaximumDataRate(double hertz, double signalToNoise){
        return hertz * ( Math.log(1 + signalToNoise)/ Math.log(2));
	}
	/**
     * Calculate and retern the value of the Maximum DataRate using the own bandwidth and signalToNoise
	 * @return MaximumDataRate
	 */
	public double getMaximumDataRate(){
        return getMaximumDataRate(bandwidth, signalToNoise);
	}



	/**
	 *	Convert this class to a meaningful string.
	 *	@return	This class as a meaningful string.
	 */
	 public String toString()	{
		 return	"Bandwidth : " + getBandwidth() + "\n" + "Signal to Noise : " + getSignalToNoise() + "\n" + "MaximumDataRate : " + getMaximumDataRate();
	}


	/* HELPER METHODS	--------------------------------------------------	*/
	/* TODO:	Place helper methods here.												*/



	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 * Entry point "main()" as required by the JVM.
	 * @param  args   Standard command line parameters (arguments) as a
	 *	string array.
	 */
	public static void main (String args[]) {
		ShannonsTheorem app = new ShannonsTheorem();

		JFrame frame = new JFrame("InputDialog Example #1");
		String myh = (String)JOptionPane.showInputDialog(
                frame,
                "Hertz",
                "Get Information",
                JOptionPane.PLAIN_MESSAGE, null,
                null,
                null);
		
		String myStn = (String)JOptionPane.showInputDialog(
                frame,
                "Signal to noize",
                "Get Information",
                JOptionPane.PLAIN_MESSAGE, null,
                null,
                null);
		//If a string was returned, say so.
		app.setBandwidth(Double.parseDouble(myh));
		app.setSignalToNoise(Double.parseDouble(myStn));
		System.out.println(app);
	}


}	/*	End of CLASS:	ShannonsTheorem.java			*/
