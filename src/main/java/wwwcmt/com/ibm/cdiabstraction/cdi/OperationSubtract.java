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
package wwwcmt.com.ibm.cdiabstraction.cdi;

public class OperationSubtract implements Operation {

	public int execute(int x, int y) {
		return x - y;
	}

}
