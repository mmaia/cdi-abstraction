/** 
 * version 1 - CDI Abstraction example
 * @author - Marcos Maia - mpais@br.ibm.com, maia.marcos@gmail.com
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * +------------------------------------------------------------------------+
 * | Licensed Materials - Property of IBM                                   |
 * | (C) Copyright IBM Corp. 2014.  All Rights Reserved.              |               |
 * +------------------------------------------------------------------------+
*/
package wwwcmt.com.ibm.cdiabstraction.controller;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import wwwcmt.com.ibm.cdiabstraction.cdi.OperationAdd;
import wwwcmt.com.ibm.cdiabstraction.cdi.OperationSubtract;

@Named
@RequestScoped
public class DummyCalcController {
	
	@Inject
	private Logger log;
	
	@Inject
	private OperationAdd opAdd;
	
	@Inject
	private OperationSubtract opSub;
	
	private int x;
	private int y;
	private String result;
	
	public String add(){
		log.info("Executing add");
		int result = opAdd.execute(x, y);
		this.result = "Result of sum of " + x + " + " + y + " = " + result;
		return "success";
	}
	
	public String subtract(){
		log.info("Executing subtract");
		int result = opSub.execute(x, y);
		this.result = "Result of subtract of " + x + " - " + y + " = " + result;
		return "success";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
