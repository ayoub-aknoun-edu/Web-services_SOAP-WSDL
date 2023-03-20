using ServiceReference;
namespace banqueclient
{
    public class Program
    {
        public static  void Main(string[] args)
        {
            BanqueServiceClient bn = new BanqueServiceClient();
            double montant = 200;
            var res = bn.ConvertAsync(montant);  
            System.Console.WriteLine("le montant "+montant+" $ en DH est "+res.Result.@return);
            var compte = bn.getCompteAsync(1);
            System.Console.WriteLine("le solde du compte "+compte.Result.@return.code+" est "+compte.Result.@return.sold);
            
        }

}
}