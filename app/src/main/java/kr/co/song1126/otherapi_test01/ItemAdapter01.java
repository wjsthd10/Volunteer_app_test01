package kr.co.song1126.otherapi_test01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ItemAdapter01 extends RecyclerView.Adapter {

    Context context;
    ArrayList<TestItems> items;

    public ItemAdapter01(Context context, ArrayList<TestItems> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView=LayoutInflater.from(context).inflate(R.layout.item_list_data, parent, false);
        VH holder=new VH(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh=(VH) holder;
        vh.area.setText(items.get(position).area);
        vh.center.setText(items.get(position).center);
        vh.centerType.setText(items.get(position).centerType);
        vh.contact.setText(items.get(position).contact);
        vh.address.setText(items.get(position).address);
        vh.addressDetail.setText(items.get(position).addressDetail);

        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, v.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class VH extends RecyclerView.ViewHolder{
        //    area    Center        Center type   Contact   address     addressDetail
        TextView area;
        TextView center;
        TextView centerType;
        TextView contact;
        TextView address;
        TextView addressDetail;


        public VH(@NonNull View itemView) {
            super(itemView);
            area=itemView.findViewById(R.id.area_item01);
            center=itemView.findViewById(R.id.center_item01);
            centerType=itemView.findViewById(R.id.centerType_item01);
            contact=itemView.findViewById(R.id.contact_item01);
            address=itemView.findViewById(R.id.address_item01);
            addressDetail=itemView.findViewById(R.id.addressDetail_item01);

        }
    }

}
