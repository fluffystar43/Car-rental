using System;
using System.Collections;
using System.Data;
using System.Drawing;
using System.Reflection;
using System.Windows.Forms;

namespace client_application
{
    public partial class formEditClient : Form
    {
        private string nameForUpdateClient;
        private int rowIndexClient;
        private DataGridView dataGridViewClient;

        localhost.ClientServiceService service = new localhost.ClientServiceService();
        localhost.client[] arrayClients;

        public formEditClient(string nameForUpdateClient, int rowIndexClient, DataGridView dataGridViewClient)
        {
            InitializeComponent();
            this.nameForUpdateClient = nameForUpdateClient;
            this.rowIndexClient = rowIndexClient;
            this.dataGridViewClient = dataGridViewClient;
        }

        /// <summary>
        /// Заполнение DataGridView данными
        /// </summary>
        //private void DataGridViewAddCells(DataGridView dataGridView, NpgsqlDataReader reader, String[] parameters)
        //{
        //    int rowNum = 0;
        //    if (dataGridView.RowCount != 0)
        //        dataGridView.RowCount = 0;
        //    while (reader.Read())
        //    {
        //        dataGridView.RowCount++;
        //        for (int i = 0; i < parameters.Length; i++)
        //        {
        //            dataGridView.Rows[rowNum].Cells[i].Value = reader[parameters[i]].ToString();
        //        }
        //        rowNum++;
        //    }
        //}

        /// <summary>
        /// Загрузка данных
        /// </summary>
        private void LoadData(String strSQL, DataGridView dataGridView)
        {
            //using (NpgsqlConnection npgSqlConnection = new NpgsqlConnection(connectionString))
            //{
            //    try
            //    {
            //        npgSqlConnection.Open();
            //        NpgsqlCommand cmd = new NpgsqlCommand(strSQL, npgSqlConnection);
            //        using (NpgsqlDataReader reader = cmd.ExecuteReader())
            //        {
            //            DataGridViewAddCells(dataGridView, reader, new String[] { "idclient", "familyname", "name", "patronymic", "passportdata", "driverslicense", "numberofphone" });
            //        }
            //        npgSqlConnection.Close();
            //    }
            //    catch (NpgsqlException ex)
            //    {
            //        MessageBox.Show(ex.Message);
            //    }
            //}
        }

        private void buttonCancel_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void buttonUpdate_Click(object sender, EventArgs e)
        {
            //Client client = new Client();
            //service
        }

        private void formEditClient_Load(object sender, EventArgs e)
        {
            textBoxPassportData.Text = (string)dataGridViewClient.Rows[rowIndexClient].Cells[4].Value;
            textBoxDriversLicense.Text = (string)dataGridViewClient.Rows[rowIndexClient].Cells[5].Value;
            textBoxNumberofphone.Text = (string)dataGridViewClient.Rows[rowIndexClient].Cells[6].Value;
        }
    }
}
