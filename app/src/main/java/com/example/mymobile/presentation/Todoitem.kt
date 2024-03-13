import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ToDoCard(a: String, b: String, onClick: () -> Unit) {
    Card(modifier = Modifier.width(250.dp).clickable { onClick() }, colors = CardDefaults.cardColors(MaterialTheme.colorScheme.secondary)) {
        Row {
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = a, modifier = Modifier.clickable(){}, style = MaterialTheme.typography.titleLarge)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = b)
            }
            Spacer(modifier = Modifier.width(60.dp))
            Icon(
                    imageVector  = Icons.Default.Edit,
                    contentDescription = "asd",
                    modifier = Modifier
                        .size(16.dp)
                        .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                    imageVector  = Icons.Default.Delete,
                    contentDescription = "asd",
                    modifier = Modifier
                        .size(16.dp)
                        .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                    imageVector  = Icons.Default.CheckCircle,
                    contentDescription = "asd",
                    modifier = Modifier.size(16.dp).align(Alignment.CenterVertically)
            )
        }
    }
}