import React from "react";
import S from "./style";

const Sidebar: React.FunctionComponent = (): JSX.Element => {
  return (
    <S.SideBarContainer>
      <S.SideBarTitle>
        <p>금융 종함</p>
        <p>웹서비스 프로그램</p>
      </S.SideBarTitle>

      <S.SideMenuListContainer>
        <ul>
          <li>
            <a href="/main">지출 캘린더</a>
          </li>
          <li>
            <a href="/recent">최근 거래 내역</a>
          </li>
          <li>
            <a href="/assets">자산 현황</a>
          </li>
          <li>
            <a href="/transaction">송금</a>
          </li>
          <li>
            <a href="/myportfolio">나의 포트폴리오</a>
          </li>
        </ul>
      </S.SideMenuListContainer>
    </S.SideBarContainer>
  );
};

export default Sidebar;
