import { useState } from "react";
import { View } from "react-native";
import { Dropdown } from "react-native-element-dropdown";
import { style } from "./style";
type Option = {
  label: string;
  value: string;
};

type Props = {
  options: Option[];
};

export function DropDown({ options }: Props) {
  const [value, setValue] = useState<string | null>(null);

  return (
    <View style={style.canvas_body}>
      <Dropdown
        style={style.dropdown}
        placeholderStyle={style.placeholder}
        selectedTextStyle={style.cor_opcao}
        data={options}
        labelField="label"
        valueField="value"
        placeholder="Selecione uma opção"
        value={value}
        onChange={(item) => setValue(item.value)}
      />
    </View>
  );
}